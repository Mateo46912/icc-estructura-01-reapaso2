
import Models.Persona;
import Views.ViewConsole;
import Controllers.PersonaController;
public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona ("Juan",25),
            new Persona ("Maria",30),
            new Persona ("Carlos",22),
            new Persona ("Ana",28),
            new Persona ("Luis",35),
            new Persona ("Sofia",27),
            new Persona ("Miguel",40),
            new Persona ("Laura",32),
            new Persona ("Pedro",29),
            new Persona ("Elena",26),

        };
        ViewConsole mostrar = new ViewConsole();
        PersonaController controlador = new PersonaController();
        mostrar.printMessage("--Arreglo de personas--");
        System.out.println();
        mostrar.printPersonsArray(personas);
        System.out.println();
        mostrar.printMessage("--Arreglo ordenado por insercion ascendente--");
        controlador.ordenarPorEdad(personas);
        mostrar.printPersonsArray(personas);
        System.out.println();
        mostrar.printMessage("Buscar persona con edad 40");
        Persona personaBuscada = controlador.buscarPorEdad(personas, 40);
        if (personaBuscada == null){
            System.out.println("La persona con edad 40 no existe");
        }else{
            mostrar.printMessage("La pesona con edad 40 es: " + personaBuscada.toString());
        }
        System.out.println("Buscar persona con edad 99");
        Persona personaBuscada2 = controlador.buscarPorEdad(personas, 99);
        if (personaBuscada2 == null){
            System.out.println("La persona con edad 99 no existe");
        }else{
        mostrar.printMessage("La personas con edad 99 es: "+personaBuscada.toString());
        }






        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD

    }
}
