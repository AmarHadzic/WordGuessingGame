# WordGuessingGame
This game is similar to the popular hang man game. The user gets 5 fresh guesses to guess the correct word letter by letter. Case sensitivity does not matter in this program. Also, if a letter is submitted more than once, it only counts as one guess. For example, if the user input "A" twice and it was wrong both times, it will only subtract 1 guess. 
# Prerequisite
* Must have gradle installed
* Must have a terminal of some sort (Apple machines already have one)
# Tools Used
* Java
* Gradle
* Kotlin
# How to play
* Download this repository as a file by clicking on code -> download zip
* Navigate to the base directory of this game in your terminal
* In the command line, type "gradle run -q --console=plain"
* Hit enter and enjoy the game!
# Unit Tests
* I have already written unit tests to test the class that keeps track of guessed letters
* To run these tests, make sure to be in the base directory and type "gradle test"
# Important Notes
* There is a default dictionary.txt file in the app file with a few random words
* You can add more words by editing this txt file and typing more words on seperate lines
