class Bob {

    String hey(String input) {
        if (input == null || input.trim().isEmpty())
            return "Fine. Be that way!";
        else if (input.trim().endsWith("?") && input.chars().anyMatch(Character:: isUpperCase) &&(input.chars().noneMatch(Character::isLowerCase)))
            return "Calm down, I know what I'm doing!";
        else if (input.trim().endsWith("?"))
            return "Sure.";
        else if (input.chars().anyMatch(Character:: isUpperCase) && input.chars().noneMatch(Character::isLowerCase))
            return "Whoa, chill out!";
        else
            return "Whatever.";
    }

}