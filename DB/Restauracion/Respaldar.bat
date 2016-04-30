@echo off
echo 127.0.0.1:5432:dbSGC:postgres:postgres> %userprofile%\AppData\Roaming\postgresql\pgpass.conf
pg_dump -h 127.0.0.1 -p 5432 -U postgres -F c -b -v -f "%userprofile%\Desktop\Postgres\dbSGC.backup" dbSGC
pause