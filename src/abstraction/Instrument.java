package abstraction;

public abstract class Instrument {

    public abstract String playSound();

    static Instrument addHorn(){
        // TODO: Create and return a Horn object
        return new Horn();
    }

    static Instrument addFlute(){
        // TODO: Create and return a Flute object
        return new Flute();
    }

    static Instrument addViolin(){
        // TODO: Create and return a Violin object
        return new Violin();
    }

    // Do not change this method
    static String[] performConcert() {
        var horn = addHorn();
        var flute = addFlute();
        var violin = addViolin();

        String[] sounds = new String[3];
        sounds[0] = play(horn);
        sounds[1] = play(flute);
        sounds[2] = play(violin);

        System.out.println(play(horn) + play(flute) + play(violin));

        return sounds;
    }

    // Do not change this method
    static String play(Instrument instrument) {
        return instrument != null ? instrument.playSound() : null;
    }

}
