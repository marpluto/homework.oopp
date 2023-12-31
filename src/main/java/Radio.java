public class Radio {
    private int currentStation;
    private int currentVolume;

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }

        currentStation = newCurrentStation;
    }

    public int getCurrentStation() {
        return currentStation;
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

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }

        currentVolume = newCurrentVolume;
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
