# Ingeniería de Software
**Grado en Ingeniería de las Tecnologías de Telecomunicación (GITT)**  
**Universidad de Sevilla - Tercer Curso**

---

# Patrones de Diseño en Java

Este repositorio contiene una recopilación de implementaciones de diversos patrones de diseño en Java, principalmente obtenidos de https://www.javacodegeeks.com/?s=java+patterns 

Los patrones de diseño son soluciones probadas a problemas comunes en el diseño de software orientado a objetos.

## 📋 Contenido

Se presentan los siguientes patrones de diseño:

### 1. 🔌 Adapter Pattern (Patrón Adaptador)

**Ubicación:** `src/com/javacodegeeks/patterns/adapterpattern/`

**Propósito:** Permite reutilizar una implementación existente, que implementa una interfaz que no es la esperada por el cliente. Actúa como un puente entre la interfaz de la implementación disponible y la esperada por el cliente.

**Implementación:**
- **Interfaces:** `Xpay` y `PayD` - Dos sistemas de pago incompatibles
- **Adaptador:** `PayX2PayDAdapter` - Adapta la interfaz Xpay a PayD
- **Cliente:** Preparado para trabajar con la interfaz `PayD`, pero puede usar implementaciones de `Xpay` mediante el adaptador
- **Ejemplo:** `RunAdapterExample.java` - Demuestra cómo el cliente puede usar XpayImpl a través del adaptador

**Caso de uso:** Integración de sistemas de pago diferentes sin modificar el código cliente.

---

### 2. 🏗️ Builder Pattern (Patrón Constructor)

**Ubicación:** `src/com/javacodegeeks/patterns/builderpattern/`

**Propósito:** Separa la construcción de objetos complejos de su representación, permitiendo crear diferentes tipos de objetos utilizando el mismo proceso de construcción.

**Implementación:**
- **Producto:** `Car` - El objeto complejo a construir
- **Builder abstracto:** `CarBuilder` - Define la interfaz para construir coches
- **Builders concretos:** 
  - `SedanCarBuilder` - Construye coches sedán
  - `SportsCarBuilder` - Construye coches deportivos
- **Director:** `CarDirector` - Controla el proceso de construcción
- **Formulario:** `Form` - Representa configuración adicional
- **Ejemplo:** `TestBuilderPattern.java` - Demuestra cómo construir diferentes tipos de coches

**Caso de uso:** Construcción de objetos complejos con diferentes configuraciones manteniendo el mismo proceso.

---

### 3. 🛡️ Proxy Pattern (Patrón Proxy)

**Ubicación:** `src/com/javacodegeeks/patterns/proxypattern/`

**Propósito:** El objeto proxy proporciona al cliente un sustituto o representante del objeto que se pretende utilizar, implementando la misma interfaz pero permitiendo controlar el acceso al representado. El cliente no interacciona directamente con el objeto de interés, sino a través de su representante o proxy.

El proyecto implementa **tres variantes** del patrón Proxy:

#### 3.1. Virtual Proxy (Proxy Virtual)

**Ubicación:** `proxypattern/virtualproxy/`

**Propósito:** Retrasa la creación y/o inicialización de objetos costosos hasta que realmente sean necesarios.

**Implementación:**
- **Interfaz:** `ContactList` - Define operaciones sobre listas de contactos
- **Objeto real:** `ContactListImpl` - Implementación real que crea la lista completa de empleados
- **Proxy:** `ContactListProxyImpl` - Retrasa la creación de la lista hasta que se solicita por primera vez
- **Contexto:** `Company` - Usa la lista de contactos a través del proxy
- **Ejemplo:** `TestVirtualProxy.java` - Demuestra la carga perezosa (lazy loading)

**Caso de uso:** Optimización de memoria retrasando la carga de listas grandes hasta que se necesiten.

#### 3.2. Protection Proxy (Proxy de Protección)

**Ubicación:** `proxypattern/protection/protectionproxy/`

**Propósito:** Controla el acceso a un objeto basándose en permisos o roles de usuario.

**Implementación:**
- **Interfaz:** `ReportGeneratorProxy` - Define operaciones para generar informes
- **Proxy:** `ReportGeneratorProtectionProxy` - Controla acceso según el tipo de usuario
- **Usuarios:** 
  - `Owner` - Tiene permisos completos
  - `Employee` y `Staff` - Permisos limitados
- **Ejemplo:** `TestProtectionProxy.java` - Demuestra control de acceso basado en roles

**Caso de uso:** Restricción de acceso a funcionalidades según el rol del usuario.

#### 3.3. Remote Proxy (Proxy Remoto)

**Ubicación:** `proxypattern/remoteproxy/`

**Propósito:** Proporciona un representante local de un objeto que existe en un espacio de direcciones diferente.

**Implementación:**
- **Interfaz:** `ReportGenerator` - Define la generación de informes
- **Implementación:** `ReportGeneratorImpl` - Implementación real del generador
- **Cliente:** `ReportGeneratorClient` - Cliente que usa el generador remoto

**Caso de uso:** Acceso transparente a objetos remotos como si fueran locales.

---

### 4. 🏭 Factory Method Pattern (Patrón Método Fábrica)

**Ubicación:** `src/factorymethod/`

**Propósito:** Define una interfaz para crear objetos, pero permite a las subclases decidir qué clase instanciar. Delega la implementación del algoritmo de instanciación a las subclases.

**Implementación:**

#### Paquete `utilidades`:
- **Producto abstracto:** `Figura` - Clase base para todas las figuras geométricas
- **Productos concretos:**
  - `Circulo`, `Cuadrado`, `Rectangulo`, `Triangulo` - Figuras estándar
  - `OtroCirculo`, `OtroCuadrado` - Variantes alternativas
- **Fábrica abstracta:** `FabricaFiguras` - Define el método fábrica
- **Fábrica concreta:** `MiFabrica` - Implementa la creación de figuras específicas
- **Extensiones:** `MiFigura` - Figura personalizada
- **Utilidades:** `OrdenacionArea` - Ordena figuras por área

#### Paquete `colecciones`:
- **Gestores de colecciones:**
  - `GestorColeccion` - Gestor base abstracto
  - `GestorCirculos`, `GestorCuadrados`, `GestorRectangulos`, `GestorTriangulos` - Gestores específicos para cada tipo de figura
- **Aplicaciones:**
  - `Colecciones.java` - Ejemplo sin Factory Method
  - `ColeccionesFM.java` - Ejemplo utilizando Factory Method para gestionar colecciones de figuras

**Caso de uso:** Sistema de gestión de figuras geométricas donde el tipo concreto de figura se determina en tiempo de ejecución.

---

## 🏗️ Estructura del Proyecto

```
Patrones/
├── src/                          # Código fuente
│   ├── com/javacodegeeks/patterns/
│   │   ├── adapterpattern/      # Patrón Adapter
│   │   ├── builderpattern/      # Patrón Builder
│   │   └── proxypattern/        # Patrón Proxy (3 variantes)
│   └── factorymethod/           # Patrón Factory Method
│       ├── colecciones/         # Gestores de colecciones
│       └── utilidades/          # Figuras y fábricas
└── bin/                         # Archivos compilados (.class)
```

## 🚀 Cómo Ejecutar

Cada patrón incluye una clase de prueba principal:

1. **Adapter Pattern:**
   ```bash
   java com.javacodegeeks.patterns.adapterpattern.site.RunAdapterExample
   ```

2. **Builder Pattern:**
   ```bash
   java com.javacodegeeks.patterns.builderpattern.TestBuilderPattern
   ```

3. **Proxy Pattern - Virtual:**
   ```bash
   java com.javacodegeeks.patterns.proxypattern.virtualproxy.TestVirtualProxy
   ```

4. **Proxy Pattern - Protection:**
   ```bash
   java com.javacodegeeks.patterns.proxypattern.protection.protectionproxy.TestProtectionProxy
   ```

5. **Factory Method:**
   ```bash
   java factorymethod.colecciones.Colecciones
   # o
   java factorymethod.colecciones.ColeccionesFM
   ```

## 📚 Patrones de Diseño - Resumen

### Patrones Creacionales
- **Builder:** Construcción paso a paso de objetos complejos
- **Factory Method:** Creación de objetos delegada a subclases

### Patrones Estructurales
- **Adapter:** Compatibilidad entre interfaces incompatibles
- **Proxy:** Control de acceso a objetos (Virtual, Protection, Remote)

## 🎓 Propósito Educativo

Este proyecto está diseñado para:
- Entender los patrones de diseño fundamentales
- Ver implementaciones prácticas en Java
- Aprender cuándo y cómo aplicar cada patrón
- Estudiar las diferencias entre variantes de un mismo patrón (ej: tipos de Proxy)

## 📖 Referencias

- **JavaCodeGeeks** - Algunos ejemplos están basados en tutoriales de JavaCodeGeeks, modificados con propósitos educativos
- **Gang of Four (GoF)** - "Design Patterns: Elements of Reusable Object-Oriented Software"

---

## 💡 Conceptos Clave

### ¿Por qué usar Patrones de Diseño?

- ✅ **Reutilización:** Soluciones probadas y documentadas
- ✅ **Comunicación:** Vocabulario común entre desarrolladores
- ✅ **Mantenibilidad:** Código más fácil de entender y modificar
- ✅ **Flexibilidad:** Sistemas más adaptables a cambios
- ✅ **Mejores prácticas:** Aplicación de principios SOLID

### Principios Aplicados

- **Open/Closed Principle:** Abierto para extensión, cerrado para modificación
- **Dependency Inversion:** Depender de abstracciones, no de implementaciones concretas
- **Single Responsibility:** Cada clase tiene una única responsabilidad
- **Interface Segregation:** Interfaces específicas mejor que una general

---

*Este README proporciona una guía general. Consulta el código fuente y los comentarios dentro de cada clase para detalles específicos de implementación.*
