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
