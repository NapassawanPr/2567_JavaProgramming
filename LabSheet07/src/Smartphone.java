
public class Smartphone {

	private String brand;
	private String model;
	private int storageCapacity;
	private final int MAX_STRORAGE_CAPACITY = 512;
	
	public void setBrand(String brand) {
		if(brand.length() < 2) {
			System.out.println("Error: Brand must have at least 2 characters!");
		} else {
			this.brand= brand;
		}
	}
	
	public void setModel(String model) {
		if(model.length() < 2) {
			System.out.println("Error: Model must have at least 2 characters!");
		} else {
			this.model= model;
		}
	}
	public void setStorageCapacity(int capacity) {
		if(capacity >= 1 && capacity <= MAX_STRORAGE_CAPACITY) {
			this.storageCapacity= capacity;
			
		} else {
			System.out.println("Error: Storage capacity must between 1 and 512 GB!");
		}
	}
	
	public void increaseStorage(int additionalStorage) {
		if(additionalStorage > 0) {
			if(additionalStorage + storageCapacity <= MAX_STRORAGE_CAPACITY) {
				storageCapacity += additionalStorage;
			} else {
				System.out.println("Error: Storage capacity cannot exceed " + MAX_STRORAGE_CAPACITY + " GB!");
			}
		} else {
			System.out.println("Error: Additional storage must be positive!");
		}
	}
	public int getRemainingStorage(int usedStorage) {
		if(usedStorage >=0 && usedStorage <= storageCapacity) {
			return storageCapacity-usedStorage;
		} else {
			System.out.println("Error: Used storage must be between 0 and " + storageCapacity + " GB!");
			return -1;
		}
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
		
	}
	
	public void printDetails() {
		System.out.println("Brand: " + this.brand);
		System.out.println("Model: " + this.model);
		System.out.println("Storage Capacity: " + this.storageCapacity + " GB");
	}
	
	
}
