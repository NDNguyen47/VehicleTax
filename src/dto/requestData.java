package dto;

public class requestData {
    private String ownerName;
    private String strVehicleValue;
    private String strEngineCapacity;

    // Constructor
    public requestData(String ownerName, String strVehicleValue, String strEngineCapacity) {
        this.ownerName = ownerName;
        this.strVehicleValue = strVehicleValue;
        this.strEngineCapacity = strEngineCapacity;
    }

    // Getter Setter
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getStrVehicleValue() {
        return strVehicleValue;
    }

    public void setStrVehicleValue(String strVehicleValue) {
        this.strVehicleValue = strVehicleValue;
    }

    public String getStrEngineCapacity() {
        return strEngineCapacity;
    }

    public void setStrEngineCapacity(String strEngineCapacity) {
        this.strEngineCapacity = strEngineCapacity;
    }
}