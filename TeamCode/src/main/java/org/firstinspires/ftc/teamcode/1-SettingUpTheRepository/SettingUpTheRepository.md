# Setting up the Repository
To setup this repository (or creating another FTC App project), we decided to fork from the original repository. This is cleaner, and allows us to update the repostiory down the line.

## Github Setup
Here are the steps to get this project forked in Github.

1) Create Github.com account
2) Navigate to <https://github.com/FIRST-Tech-Challenge/FtcRobotController>
3) In the top right-hand corner, select "Fork"
4) Give your new project an appropriate name

Congratulations! You have forked the repository, and are ready to start coding.

## Android Studio Setup

### The next step to coding with your new repository will be to setup Github and Git within Android Studio.

1) Open Android Studio
2) Open Android Studio Settings
3) Find the "Version Control" settings in the menu bar
4) Open "Github" Settings
5) Add your Github account

### We have now setup your Github account in Android Studio, now we have to setup Git

1) Open Windows Terminal/Command Prompt
2) Enter the following commands:
```
git config user.name "Your Github Username"
git config user.email "The Email Address You Used to Create Your Github Account"
```
3) Close the Windows Terminal/Command Prompt

### Now it is time to get our repository into Android Studio

1) Open Android Studio
2) At the "Welcome to Android Studio" menu, select "Get from Version Control"
3) Select "Github"
4) Choose your Username
5) Select the repository from the list
6) Select clone

This should download and open up your repository in Android Studio.
Next time you want to open it, you can select it straight from the Android Studio Welcome Menu

## Our First Commit
To make sure our first commit is successful, we have a couple of things to do.

1) Make a basic change in the repository (add a file, create a folder, etc.)
2) Do CTRL+K, this will open up the Commit Log
3) Type a message in the Commit Log
4) In the top right corner, select the "Author" text box
5) Type in "YourUserName <youremailaddress>" This should be the same as what you put into Git earlier
6) In the bottom right, select the dropdown arrow next to "Commit"
7) Select Commit and Push
8) When the "Push" dialog shows up, select push in the bottom right corner

Success! You have created, setup, committed, and pushed to your own repository! 