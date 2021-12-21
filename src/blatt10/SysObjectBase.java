package blatt10;

abstract public class SysObjectBase {
	String name;
	String owner;
	
	SysObjectBase(String name) {
		this.name = name;
		this.owner = System.getenv("USER");
	}
	
	public String toString() {
		return String.format("Class=%s, Name=%s, User=%s", 
				this.getClass().getSimpleName()
				,this.name, this.owner);
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setOwner(String owner) {
		this.owner = owner;
	}
}

class SysTextFile extends SysObjectBase {
	String type;
	String text = "";

	SysTextFile(String name, String type) {
		super(name);
		this.type = type;
	}
	
	void setText(String text) {
		this.text = text;
	}
	
	public String toString() {
		return String.format("Class=%s, Name=%s, User=%s, Type=%s, Length=%s:",
				this.getClass().getSimpleName()
				,this.name, this.owner, this.type, this.text.length());
	}
}

class SysDirectory extends SysObjectBase {
	SysObjectBase[] sysObjects;
	
	SysDirectory(String name, SysObjectBase... sysObjects) {
		super(name);
		this.sysObjects = sysObjects;
	}
	
	public String toString() {
		return String.format("Class=%s, Name=%s, User=%s, NumberOfObjects=%s"
				, this.getClass().getSimpleName(), this.name, this.owner, 
				this.sysObjects.length);
	}

	/** Struktur des Verzeichnisses ermitteln
	 * 
	 * @param indent Einrückung links (wird durch Rekursion verbreitert)
	 * @return Struktur des Verzeichnisses als String
	 */
	public String dirStructure(String indent) {
		String ret = indent + this.toString();
		for (SysObjectBase obj: sysObjects) {
			if (obj.getClass().getName() == "blatt10.SysDirectory") {
				ret += ((SysDirectory) obj).dirStructure("\n| - ");
			} else {
				ret += indent + "| - " + obj;	
			}
		}
		return ret;
	}
}
