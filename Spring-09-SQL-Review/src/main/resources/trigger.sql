DROP TABLE IF EXISTS mentors;
CREATE TABLE mentor(
    id INT GENERATED ALWAYS AS IDENTITY,
    first_name varchar(40) not null,
    last_name varchar(40) not null,
    primary key(id)
);


DROP TABLE IF EXISTS mentor_audit;
CREATE TABLE mentor_audit(
    id INT GENERATED ALWAYS AS IDENTITY,
    mentor_id INT not null,
    last_name varchar(40) not null,
    changed_on timestamp(6) not null,
    primary key(id)
);

insert into mentor(first_name, last_name) values ('Mike', 'Smith');
insert into mentor(first_name, last_name) values ('Tom', 'Hanks');


create  or replace function log_last_name_changes()
returns trigger
language plpgsql
as
    $$
    begin
        --logic
        IF  NEW.last_name <> OLD.last_name THEN
            INSERT INTO mentor_audit(mentor_id, last_name, changed_on) VALUES
            (OLD.id,OLD.last_name, now());
        end if;

        RETURN new;
    end;
    $$
CREATE TRIGGER last_name_change
    BEFORE update
    ON mentor
    FOR EACH ROW
    EXECUTE PROCEDURE log_last_name_changes();

==TO DELETE THE TRIGGER
Drop trigger if exists last_name_change on mentor;





==changing the last name
update  mentor
set last_name ='ABC'
where id=2;
