import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class DialingCodes {

    private Map<Integer, String> dialingCodes;

    public DialingCodes() {
        this.dialingCodes = new HashMap<>();
    }

    public Map<Integer, String> getCodes() {
        return dialingCodes;
    }

    public void setDialingCode(Integer code, String country) {
        dialingCodes.put(code, country);
    }

    public String getCountry(Integer code) {
        return dialingCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (dialingCodes.get(code) == null
                && !dialingCodes.containsValue(country)) {
            dialingCodes.put(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        Optional<Map.Entry<Integer, String>> first = dialingCodes.entrySet().stream()
                .filter(integerStringEntry -> integerStringEntry.getValue().equals(country))
                .findFirst();
        return first.map(Map.Entry::getKey).orElse(null);
    }

    public void updateCountryDialingCode(Integer code, String country) {
        for (Map.Entry<Integer, String> entry : dialingCodes.entrySet()) {
            if (entry.getValue().equals(country)) {
                dialingCodes.remove(entry.getKey());
                dialingCodes.put(code, country);
            }
        }
    }
}
