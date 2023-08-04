import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentStation;
    private int currentVolume;
    private int numOfStation = 10;

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
