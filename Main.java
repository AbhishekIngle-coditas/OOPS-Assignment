// Instrument.java

package Practice.Question_Instrument;

// Instrument class acts as a base class for Piano, Flute, and Guitar
class Instrument {
    // This method will be overridden by subclasses
    public void play() {
        System.out.println("Instrument is playing");
    }
}

// Subclass Piano
class Piano extends Instrument {
    @Override
    public void play() {
        System.out.println("Piano is playing tan tan tan tan");
    }
}

// Subclass Flute
class Flute extends Instrument {
    @Override
    public void play() {
        System.out.println("Flute is playing toot toot toot toot");
    }
}

// Subclass Guitar
class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("Guitar is playing tin tin tin");
    }
}

// Main class to test the instrument array
public class Main {
    public static void main(String[] args) {
        // Create an array of 10 Instruments
        Instrument[] instruments = new Instrument[10];

        // Assign different types of instruments to Instrument references
        for (int i = 0; i < instruments.length; i++) {
            if (i % 3 == 0) {
                instruments[i] = new Piano(); // Every third instrument is a Piano
            } else if (i % 3 == 1) {
                instruments[i] = new Flute(); // Every fourth instrument is a Flute
            } else {
                instruments[i] = new Guitar(); // Rest are Guitar
            }
        }

        // Check for polymorphic behavior of the play method
        for (int i = 0; i < instruments.length; i++) {
            // Print which object is stored at which index of instrument array
            if (instruments[i] instanceof Piano) System.out.println("Index " + i + ": Piano object");
            else if (instruments[i] instanceof Flute) System.out.println("Index " + i + ": Flute object");
            else if (instruments[i] instanceof Guitar) System.out.println("Index " + i + ": Guitar object");


            // Call the play method for each instrument
            instruments[i].play();
        }
    }
}
