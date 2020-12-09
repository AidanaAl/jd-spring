SELECT
    tablename,
    indexname,
    indexdef
FROM
    pg_indexes
WHERE
        schemaname = 'public'
ORDER BY
    tablename,
    indexname;


CREATE INDEX idx_towns_name ON towns (name);

Drop index  if exists idx_towns_name;
