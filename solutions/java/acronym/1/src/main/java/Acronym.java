class Acronym {
    private StringBuilder siglaTla = new StringBuilder();    

    Acronym(String phrase) {
        String[] palavras = phrase.replaceAll("[^a-z A-Z-]" , "").split("[ -]");
        for (String palavra: palavras){
            if (!palavra.isEmpty())
                siglaTla.append(Character.toUpperCase(palavra.charAt(0)));
        }
    }

    String get() {
      return siglaTla.toString();
    }
}
