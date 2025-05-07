////////////////////////////////////////////////////////////////////
 // [Davide] [Lorenzon] [2 101 075] 
 // [Christian] [Libralato] [ 2 101 047] 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss; 

//classe di supporto per la stampa in ascii art

public enum RomanLetters {
    I(null),
    V(null),
    X(null),
    L(null),
    C(null),
    D(null),
    M(null);

    private final String[] asciiArt;

    private RomanLetters(String[] asciiArt) {
        this.asciiArt = null;
    }

    public String[] getAsciiArt() {
        return null;
    }

    public static RomanLetters fromChar(char c) {
        throw new UnsupportedOperationException("Non ancora implementato");
    }
}