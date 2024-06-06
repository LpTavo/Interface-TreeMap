import java.util.TreeMap;
import java.util.Map;
import java.util.SortedMap;

public class EjemploTreMap {
    public static void main(String[] args) {
       
        Map<String, Integer> inventario = new TreeMap<>();
        
       
        inventario.put("Manzanas", 50);
        inventario.put("Naranjas", 30);
        inventario.put("Peras", 20);
        inventario.put("Plátanos", 40);
        
        
        System.out.println("Inventario: " + inventario);
        
   
        System.out.println("Cantidad de Manzanas: " + inventario.get("Manzanas"));
        
      
        System.out.println("¿El mapa contiene la clave 'Peras'? " + inventario.containsKey("Peras"));
        System.out.println("¿El mapa contiene la clave 'Cerezas'? " + inventario.containsKey("Cerezas"));
        
      
        System.out.println("¿El mapa contiene el valor 30? " + inventario.containsValue(30));
        
      
        inventario.remove("Naranjas");
        System.out.println("Inventario después de eliminar 'Naranjas': " + inventario);
        
     
        System.out.println("Tamaño del mapa: " + inventario.size());
        
        
        System.out.println("Primera clave: " + ((TreeMap<String, Integer>) inventario).firstKey());
        System.out.println("Última clave: " + ((TreeMap<String, Integer>) inventario).lastKey());
        
       
        SortedMap<String, Integer> subMap = ((TreeMap<String, Integer>) inventario).subMap("Manzanas", "Plátanos");
        System.out.println("Submapa de 'Manzanas' a 'Plátanos': " + subMap);
        
        
        inventario.clear();
        System.out.println("Inventario después de limpiar: " + inventario);
    }
}
