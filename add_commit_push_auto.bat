@echo off
set /p branch=ENTER BRANCH TO PUSH:
set /p msg=ENTER COMMIT MESSAGE: 

for /f %%A in ('git remote') do set remote=%%A

git add .
git commit -m "%msg%"
git push "%remote%" "%branch%"
