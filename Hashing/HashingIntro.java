package Hashing;
public class HashingIntro{

    private class Entity{
        String key;
        String value;

        Entity(String key, String value){
            this.key = key;
            this.value = value;
        }
    }

    private Entity[] entities;

    public HashingIntro(){
        entities = new Entity[100];
    }

    public String get(String key){
        int hash = Math.abs(key.hashCode() % entities.length); // index
        if(entities[hash] != null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
    }

    public void put(String key, String name){
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, name);
    }

    public void remove(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)){
           entities[hash] = null;
        }
    }
    public static void main(String[] args) {
        HashingIntro hashtable = new HashingIntro();
        hashtable.put("Pranali", "Habib");
        hashtable.put("abc", "pqr");
        hashtable.put("jhiu", "bhgjhb");
        System.out.println(hashtable.get("Pranali"));
        System.out.println(hashtable.get("jhiu"));
        System.out.println(hashtable.get("abc"));
        hashtable.remove("jhiu");
        System.out.println(hashtable.get("Pranali"));
        System.out.println(hashtable.get("jhiu"));
        System.out.println(hashtable.get("abc"));
        System.out.println(hashtable.get("Unknown"));
    }
}


// Index →   0        1        2        3                  4
//         ----------------------------------------------------
// Table →  null    null    null   [ Entity ]            null
//                               ┌───────────────┐
//                               │ key   = Sally │
//                               │ value = 88    │
//                               └───────────────┘
