# Design Problem Solving

## Scenario Description

Participants are provided with a series of common software design challenges. They will need to choose appropriate design patterns to solve these specific problems effectively.

## Design Challenges

1. **Global Configuration Management**  
   Design a system that ensures a single, globally accessible configuration object without access conflicts.

Para este podemos usar un patron de diseño SINGLETON: La configuración es un recurso compartido que debe ser accesible por distintos componentes del sistema, pero es importante que no se creen múltiples instancias de este recurso, ya que podrían surgir conflictos de configuración o inconsistencias en los valores compartidos. El patrón Singleton resuelve este problema asegurando una única instancia.


2. **Dynamic Object Creation Based on User Input**  
   Implement a system to dynamically create various types of user interface elements based on user actions.

Para este podemos usar un patron de diseño FACTORY: En un sistema de interfaz de usuario que responde a entradas dinámicas de los usuarios, es probable que necesites crear diferentes tipos de elementos de UI según las acciones del usuario (por ejemplo, botones, campos de texto, menús, etc.). El patrón Factory encapsula la lógica de creación, permitiendo a la aplicación seleccionar el tipo de elemento de interfaz correcto en función de las necesidades sin preocuparse por los detalles de implementación.

3. **State Change Notification Across System Components**  
   Ensure components are notified about changes in the state of other parts without creating tight coupling.

Para este podemos usar un patron de diseño OBSERVER: En un sistema en el que los cambios en un componente deben propagarse a otros (por ejemplo, actualizaciones de UI en respuesta a cambios de datos o eventos del sistema), el patrón Observer permite que los componentes suscriptores (observadores) reciban notificaciones automáticas de estos cambios. Esto es particularmente útil en arquitecturas donde el estado de un componente puede afectar a varios otros sin una dependencia directa.

4. **Efficient Management of Asynchronous Operations**  
   Manage multiple asynchronous operations like API calls which need to be coordinated without blocking the main application workflow.

Para este optaría por usar algún patro Async, podría usar en java el CompletableFuture: Permite iniciar una operación y obtener un objeto de resultado que se completará en el futuro.

Para este podemos usar un patron de diseño ASYNC

## Task

Outline solutions that integrate these patterns into a cohesive design to address the challenges.

---

## Project Execution Simulation

Simulate the application of these patterns in a hypothetical software project. Document the approach, rationale, and integration process of the chosen patterns as they apply to the design challenges.






# Implementación de Patrones de Diseño en el Sistema de Tienda

Este proyecto utiliza varios patrones de diseño para crear un sistema de tienda estructurado, flexible y eficiente. A continuación, se detallan los patrones implementados y su propósito en el sistema.

---

## 1. Singleton - Configuración Global de la Tienda

- **Propósito**: Garantizar que solo haya una única instancia de la configuración de la tienda en toda la aplicación.

- **Cómo se aplicó**:
  Se creó una clase de configuración que almacena datos generales, como el impuesto y el descuento de la tienda. Esta clase es única en toda la aplicación, lo cual asegura que cualquier cambio en estos valores se refleje en toda la tienda. Con esto evitamos inconsistencias y ahorramos recursos.

---

## 2. Factory - Creación Dinámica de un Producto

- **Propósito**: Permitir la creación flexible de distintos tipos de productos sin tener que cambiar el código cada vez que se añada un nuevo tipo.

- **Cómo se aplicó**:
  Se creó un mecanismo para generar productos de diferentes tipos (por ejemplo, ropa, alimentos o electrodomésticos) en función de las necesidades de la tienda. En lugar de definir cada tipo de producto por separado, usamos una fábrica que se encarga de crear el producto correcto según el tipo solicitado, lo que hace que el código sea más limpio y fácil de extender.

---

## 3. Observer - Notificación de Cambio en el Inventario del Producto

- **Propósito**: Permitir que ciertos componentes de la tienda (como la interfaz de usuario o el sistema de alertas) sean notificados automáticamente cuando cambie el inventario de un producto.

- **Cómo se aplicó**:
  Se definió un sistema en el cual los observadores (por ejemplo, la interfaz de usuario o un sistema de alertas) están atentos a los cambios en el inventario. Cuando el inventario cambia (como después de una compra), estos observadores reciben automáticamente una notificación con el nuevo estado del inventario. Esto asegura que cualquier cambio se refleje de inmediato donde sea necesario.

---

## 4. Async - Procesamiento Asíncrono de la Compra

- **Propósito**: Realizar compras de productos sin bloquear el funcionamiento principal de la tienda, permitiendo que otras operaciones sigan funcionando al mismo tiempo.

- **Cómo se aplicó**:
  Las operaciones de compra se configuraron para ejecutarse en segundo plano. Cuando un cliente hace una compra, el sistema procesa el pedido sin detener el funcionamiento general de la tienda. Esto hace que la tienda sea más eficiente, ya que permite procesar varias compras al mismo tiempo y mejora la experiencia del usuario al evitar tiempos de espera.

---

### Conclusión

Estos cuatro patrones de diseño ayudan a mantener el sistema de la tienda organizado, flexible y eficiente, garantizando que funcione de forma correcta y ágil.
