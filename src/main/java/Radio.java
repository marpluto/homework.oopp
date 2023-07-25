public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        currentStation = newCurrentStation;

        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
    }

    public void nexCurrentStation() {
        currentStation += 1;
        if (currentStation > 9) {
            currentStation = 0;
        }
    }

    public void prevCurrentStation() {
        currentStation -= 1;
        if (currentStation < 0) {
            currentStation = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
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
