@echo off
set /p dirx=ENTER JAVAX DIRECTORY:
cd /d "%dirx%" || (
    echo Directory does not exist.
    pause
    exit /b
)
git remote remove javax
git init
git remote add javax https://github.com/khanni1/JAVA.git
echo Please login to GitHub if prompted...
pause
git fetch javax clg
git checkout -b clg javax/clg

echo BRANCH
git branch
echo.
echo BRANCH -VV
git branch -vv

pause
git config --global user.email
git config --global user.name
pause
explorer "%dirx%"
