package collect;

import java.util.List;

public class Shop {
	
	private String name;
	private List<Commodity> commodities;
	
	
	public Shop(String name, List<Commodity> commodities) {
		super();
		this.name = name;
		this.commodities = commodities;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Commodity> getCommodities() {
		return commodities;
	}
	public void setCommodities(List<Commodity> commodities) {
		this.commodities = commodities;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commodities == null) ? 0 : commodities.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shop other = (Shop) obj;
		if (commodities == null) {
			if (other.commodities != null)
				return false;
		} else if (!commodities.equals(other.commodities))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Shop [name=" + name + ", commodities=" + commodities + "]";
	}
	
	
	
}
