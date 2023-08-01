public class Radio {
    private int currentStation;
    private int currentVolume;
    private int numOfStation = 10;

    public Radio() {
    }

    public Radio(int numOfStation) {
        this.numOfStation = numOfStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= numOfStation) {
            return;
        }
        if (currentStation < 0) {
            return;
        }

        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }

        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void nexCurrentStation() {
        currentStation += 1;
        if (currentStation >= numOfStation) {
            currentStation = 0;
        }
    }

    public void prevCurrentStation() {
        currentStation -= 1;
        if (currentStation < 0) {
            currentStation = numOfStation - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume += 1;
        }
    }

    public void lowerVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        }
    }
}
