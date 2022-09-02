--- CREATE DB NAME : project
SELECT 'CREATE DATABASE project'
WHERE NOT EXISTS (SELECT FROM pg_database WHERE datname = 'project')\gexec
--- CREATE DB NAME : collaborator
SELECT 'CREATE DATABASE collaborator'
WHERE NOT EXISTS (SELECT FROM pg_database WHERE datname = 'collaborator')\gexec
--- CREATE DB NAME : affectation
SELECT 'CREATE DATABASE affectation'
WHERE NOT EXISTS (SELECT FROM pg_database WHERE datname = 'affectation')\gexec

