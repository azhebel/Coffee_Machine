enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    int level;

    DangerLevel(int i) {
        this.level = i;
    }

    int getLevel() {
        return this.level;
    }
}