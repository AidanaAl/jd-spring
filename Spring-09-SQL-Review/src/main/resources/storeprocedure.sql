CREATE OR REPLACE PROCEDURE update_department(emp_id int)
language plpgsql
as
    $$
    declare
    begin
         update employees set department = 'Toys' where employee_id=emp_id;
         commit;
    end;
    $$;

call update_department(1);

Select * from employees where employee_id=1;


CREATE OR REPLACE PROCEDURE transfer(
    sender int,
    receiver int,
    amount dec)
    language plpgsql
as
$$
declare
begin
    update employees
    set salary = salary-amount
    where employee_id=receiver;
    commit;
end;
$$;

call transfer(1,2,44000);
