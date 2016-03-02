class HeightSample {
    int height;
    int width;
    int depth;
    
    int volume() {
        int volume = this.height * this.width * this.depth;
        return volume;
    }
}