package ecommerce.exception;

/*Excepción personalizada que se lanza al buscar un producto por id y
el mismo no existe en e sistema. Otorga claridad en la comunicación 
de errores

Hereda RuntimeException 
*/
public class ProductoNoEncontradoException extends RuntimeException {
    public ProductoNoEncontradoException(String mensaje) {
        /*super() llama al constructor de la clase padre RuntimeException
        que es quien guarda el mensaje y lo expone con getMessage() */
        super(mensaje);
    }
}
