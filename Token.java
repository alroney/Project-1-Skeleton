// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// Spring 2023

// Enumerated type that defines the list of tokens

enum Token {AT, COLOR, END,	HEIGHT, RECTANGLE, RIGHT_TRIANGLE, SCENE, WIDTH, COMMA, SEMICOLON, PERIOD, LEFT_PAREN,
    RIGHT_PAREN, ISOSCELES_TRIANGLE, TEXT, IDENTIFIER, NUMBER, EOF;

    //Add a new method to handle the additional case
    public static Token fromString(String str) {
        for (Token t : Token.values()) {
            if (t.name().replace("_", "").equals(str.toUpperCase())) {
                return t;
            }
        }
        return IDENTIFIER;
    }
}