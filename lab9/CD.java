class CD extends LibraryItem {
    private String band;
    private String title;
    private int numTracks;

    public CD(String type, String ID, String band, String title, int tracks) {
        super(type, ID);
        this.band = band;
        this.title = title;
        this.numTracks = tracks;
    }

    public String toString() {
        return super.toString() + "\nBand :" + band + "\nTitle :" + title + "\nTracks :" + numTracks;
    }
}
