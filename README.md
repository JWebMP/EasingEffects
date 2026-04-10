# JWebMP Easing Effects

[![Maven Central](https://img.shields.io/maven-central/v/com.jwebmp.plugins/easing-effects)](https://central.sonatype.com/artifact/com.jwebmp.plugins/easing-effects)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue)](https://www.apache.org/licenses/LICENSE-2.0)

![Java 25+](https://img.shields.io/badge/Java-25%2B-green)
![Modular](https://img.shields.io/badge/Modular-JPMS-green)
![Angular](https://img.shields.io/badge/Angular-20-DD0031?logo=angular)
![TypeScript](https://img.shields.io/badge/TypeScript-5-3178C6?logo=typescript)

<!-- Tech icons row -->
![Easing](https://img.shields.io/badge/Easing-1.4.1-blueviolet)
![JWebMP](https://img.shields.io/badge/JWebMP-2.0-0A7)

Advanced easing animation effects for JWebMP with Angular 21. Provides 33 easing timing functions based on easings.net for smooth, natural animations in web applications.

Built on [easings.net](https://easings.net/) · [Angular 21](https://angular.dev/) · [JWebMP Core](https://jwebmp.com/) · JPMS module `com.jwebmp.plugins.easingeffects` · Java 25+

**Version: 1.4.1** — Complete easing animation library with type-safe Java enum API.

## Installation

```xml
<dependency>
  <groupId>com.jwebmp.plugins</groupId>
  <artifactId>easing-effects</artifactId>
  <version>2.0.0-RC1</version>
</dependency>
```

<details>
<summary>Gradle (Kotlin DSL)</summary>

```kotlin
implementation("com.jwebmp.plugins:easing-effects:2.0.0-RC1")
```
</details>

### NPM Dependencies

The plugin automatically includes easing dependencies:

```json
{
  "dependencies": {
    "easing": "*"
  }
}
```

## Features

- **33 Easing Functions** — Complete library of animation timing functions
- **Type-Safe Enum API** — Java enum for compile-time safety and IDE autocomplete
- **Angular 21 Integration** — Auto-loaded via PageConfigurator with browser-easing.js
- **Based on easings.net** — Industry-standard easing reference implementation
- **Zero Configuration** — Auto-registered via ServiceLoader SPI
- **Modular Architecture** — JPMS module with explicit dependencies
- **Animation Categories** — Quad, Cubic, Quart, Quint, Expo, Sine, Circ, Elastic, Back, Bounce
- **In/Out/InOut Variants** — Each timing function includes ease-in, ease-out, and ease-in-out
- **Linear & Swing** — Classic timing functions for simple animations
- **CRTP Fluent API** — Method chaining for animation configuration

## Quick Start

### Prerequisites

- **Java 25 LTS** (required)
- **Maven 3.8+**
- **Node.js 18+** (for frontend builds)
- **Angular 21+** (auto-integrated via JWebMP)

### Basic Usage

```java
import com.jwebmp.plugins.easingeffects.JQEasingEffects;
import com.jwebmp.core.base.html.Div;

public class AnimatedComponent extends Div<AnimatedComponent> {

    public AnimatedComponent() {
        super();

        // Use easing effect in animation
        String easingFunction = JQEasingEffects.easeInOutQuad.toString();

        // Apply to element animation (example with custom animation)
        setAttribute("data-easing", easingFunction);
    }
}
```

### TypeScript/Angular Usage

The easing functions are available in the Angular application:

```typescript
import { easeInOutQuad, easeOutBounce } from 'easing';

// Use in Angular animations
animations: [
  trigger('slideIn', [
    transition(':enter', [
      style({ transform: 'translateX(-100%)' }),
      animate('500ms', style({ transform: 'translateX(0)' }))
    ])
  ])
]
```

### All Available Easing Functions

```java
// Linear
JQEasingEffects.linear
JQEasingEffects.swing

// Quad (Quadratic)
JQEasingEffects.easeInQuad
JQEasingEffects.easeOutQuad
JQEasingEffects.easeInOutQuad

// Cubic
JQEasingEffects.easeInCubic
JQEasingEffects.easeOutCubic
JQEasingEffects.easeInOutCubic

// Quart (Quartic)
JQEasingEffects.easeInQuart
JQEasingEffects.easeOutQuart
JQEasingEffects.easeInOutQuart

// Quint (Quintic)
JQEasingEffects.easeInQuint
JQEasingEffects.easeOutQuint
JQEasingEffects.easeInOutQuint

// Expo (Exponential)
JQEasingEffects.easeInExpo
JQEasingEffects.easeOutExpo
JQEasingEffects.easeInOutExpo

// Sine
JQEasingEffects.easeInSine
JQEasingEffects.easeOutSine
JQEasingEffects.easeInOutSine

// Circ (Circular)
JQEasingEffects.easeInCirc
JQEasingEffects.easeOutCirc
JQEasingEffects.easeInOutCirc

// Elastic
JQEasingEffects.easeInElastic
JQEasingEffects.easeOutElastic
JQEasingEffects.easeInOutElastic

// Back
JQEasingEffects.easeInBack
JQEasingEffects.easeOutBack
JQEasingEffects.easeInOutBack

// Bounce
JQEasingEffects.easeInBounce
JQEasingEffects.easeOutBounce
JQEasingEffects.easeInOutBounce
```

---

## Architecture

### Technology Stack

- **Backend**: Java 25 LTS, Maven, GuicedEE (IoC)
- **Frontend**: Angular 21, TypeScript, easing library
- **Integration**: JWebMP Page Configurators, ServiceLoader SPI
- **Animation**: Easings.net reference implementation
- **Module System**: JPMS with explicit dependencies

### Module Structure

```
src/main/java/com/jwebmp/plugins/easingeffects/
├── JQEasingEffects.java           # Enum with 33 easing functions
└── JQEasingPageConfigurator.java  # Auto-registration via ServiceLoader
```

### Easing Function Categories

| Category | Functions | Use Case |
|----------|-----------|----------|
| **Linear** | linear, swing | Constant speed, simple transitions |
| **Quad** | easeInQuad, easeOutQuad, easeInOutQuad | Subtle acceleration/deceleration |
| **Cubic** | easeInCubic, easeOutCubic, easeInOutCubic | Moderate acceleration curves |
| **Quart** | easeInQuart, easeOutQuart, easeInOutQuart | Strong acceleration effects |
| **Quint** | easeInQuint, easeOutQuint, easeInOutQuint | Very strong acceleration |
| **Expo** | easeInExpo, easeOutExpo, easeInOutExpo | Exponential curves, dramatic effects |
| **Sine** | easeInSine, easeOutSine, easeInOutSine | Smooth, gentle curves |
| **Circ** | easeInCirc, easeOutCirc, easeInOutCirc | Circular motion paths |
| **Elastic** | easeInElastic, easeOutElastic, easeInOutElastic | Spring-like bounce effects |
| **Back** | easeInBack, easeOutBack, easeInOutBack | Overshoot and return |
| **Bounce** | easeInBounce, easeOutBounce, easeInOutBounce | Bouncing ball physics |

### Easing Variants

- **easeIn** — Slow start, fast finish (acceleration)
- **easeOut** — Fast start, slow finish (deceleration)
- **easeInOut** — Slow start, fast middle, slow finish (acceleration + deceleration)

---

## API Reference

### JQEasingEffects Enum

All easing functions are available as enum constants:

```java
public enum JQEasingEffects {
    linear,
    swing,
    easeInQuad,
    easeOutQuad,
    easeInOutQuad,
    easeInCubic,
    easeOutCubic,
    easeInOutCubic,
    easeInQuart,
    easeOutQuart,
    easeInOutQuart,
    easeInQuint,
    easeOutQuint,
    easeInOutQuint,
    easeInExpo,
    easeOutExpo,
    easeInOutExpo,
    easeInSine,
    easeOutSine,
    easeInOutSine,
    easeInCirc,
    easeOutCirc,
    easeInOutCirc,
    easeInElastic,
    easeOutElastic,
    easeInOutElastic,
    easeInBack,
    easeOutBack,
    easeInOutBack,
    easeInBounce,
    easeOutBounce,
    easeInOutBounce
}
```

### Usage in Components

```java
// Get easing function name as string
String easingName = JQEasingEffects.easeOutBounce.toString();

// Use in animation configuration
component.setAttribute("data-easing", easingName);

// Pass to frontend animation API
jsonObject.put("easing", JQEasingEffects.easeInOutCubic.name());
```

---

## Testing

### Run Unit Tests

```bash
mvn clean test
```

### Code Coverage Report

```bash
mvn clean test jacoco:report
# Open: target/site/jacoco/index.html
```

### Test Example

```java
import com.jwebmp.plugins.easingeffects.JQEasingEffects;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EasingEffectsTest {

    @Test
    public void testEasingEnumValues() {
        assertEquals("easeInQuad", JQEasingEffects.easeInQuad.toString());
        assertEquals("easeOutBounce", JQEasingEffects.easeOutBounce.toString());
        assertNotNull(JQEasingEffects.linear);
    }

    @Test
    public void testAllEasingFunctionsAvailable() {
        // Verify all 33 easing functions exist
        assertEquals(33, JQEasingEffects.values().length);
    }
}
```

---

## Configuration

### Auto-Configuration via PageConfigurator

The plugin is automatically configured when present on the classpath:

```java
@TsDependency(value = "easing", version = "*")
@NgScript(name = "Easing", value = "easing/browser-easing.js", sortOrder = 4)
public class JQEasingPageConfigurator implements IPageConfigurator {
    // Auto-loaded via ServiceLoader SPI
}
```

### Manual Disable (Optional)

```java
JQEasingPageConfigurator.setEnabled(false);
```

---

## Module Graph

```
com.jwebmp.plugins.easingeffects
 ├── com.jwebmp.core              (JWebMP core)
 ├── com.jwebmp.client            (Client-side integration)
 ├── com.jwebmp.typescript.client (TypeScript generation)
 └── jakarta.validation           (Bean validation)
```

### Exported Packages

- `com.jwebmp.plugins.easingeffects` — Core easing effects enum and configurator

---

## Documentation

### Core Resources

- **[Easings.net](https://easings.net/)** — Interactive easing function reference
- **[JWebMP Home](https://jwebmp.com/)** — JWebMP framework documentation
- **[Angular Animations](https://angular.dev/guide/animations)** — Angular animation guide

### Project Files

| File | Purpose |
|------|---------|
| `JQEasingEffects.java` | Enum with 33 easing functions |
| `JQEasingPageConfigurator.java` | Auto-configuration via ServiceLoader |
| `pom.xml` | Maven build configuration |
| `module-info.java` | JPMS module descriptor |

---

## Common Use Cases

### Button Hover Animation

```java
public class AnimatedButton extends Button<AnimatedButton> {
    public AnimatedButton() {
        super("Click Me");
        addClass("animated-button");
        setAttribute("data-easing", JQEasingEffects.easeOutBack.toString());
    }
}
```

### Modal Slide-In

```java
public class Modal extends Div<Modal> {
    public Modal() {
        super();
        addClass("modal");
        setAttribute("data-enter-easing", JQEasingEffects.easeOutCubic.toString());
        setAttribute("data-exit-easing", JQEasingEffects.easeInCubic.toString());
    }
}
```

### Page Transition

```java
public class PageTransition {
    public static String getTransitionEasing() {
        return JQEasingEffects.easeInOutQuad.toString();
    }
}
```

### Bouncing Notification

```java
public class Notification extends Div<Notification> {
    public Notification(String message) {
        super();
        setText(message);
        addClass("notification");
        setAttribute("data-easing", JQEasingEffects.easeOutBounce.toString());
    }
}
```

---

## Security

This project takes security seriously.

**Key Security Features**:
- No external network calls
- No secrets or credentials required
- Pure client-side animation library
- OWASP Dependency-Check in CI/CD
- GitHub Dependabot enabled
- JSpecify null-safety annotations

---

## Contributing

Contributions are welcome! Please follow these guidelines:

1. **Fork** the repository
2. **Create a feature branch** (`git checkout -b feature/my-feature`)
3. **Commit with clear messages** (`git commit -m "feat: add new easing function"`)
4. **Push to your fork** (`git push origin feature/my-feature`)
5. **Open a Pull Request**

### Code Standards

- **Java**: Follow JWebMP conventions (enum naming, proper null safety)
- **Tests**: JUnit 5, ≥80% coverage (Jacoco enforced)
- **Formatting**: Maven Spotless plugin enforced
- **Documentation**: Update README for new easing functions

---

## Project Status

| Aspect | Status |
|--------|--------|
| **Version** | 1.4.1 / 2.0.0-RC1 |
| **Easing Functions** | 33 complete |
| **Java** | 25 LTS (required) |
| **Build** | Passing |
| **License** | Apache 2.0 |
| **Maintenance** | Active |

---

## Links

- **GitHub Repository**: https://github.com/JWebMP/JWebMP
- **Maven Central**: https://mvnrepository.com/artifact/com.jwebmp.plugins/easing-effects
- **Easings Reference**: https://easings.net/
- **JWebMP Home**: https://jwebmp.com/

---

## License

Licensed under the [Apache License 2.0](LICENSE).

```
Copyright 2025 JWebMP Contributors

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

---

## Acknowledgments

- **[easings.net](https://easings.net/)** — Easing function reference and visualization
- **[Robert Penner](http://robertpenner.com/easing/)** — Original easing equations
- **[JWebMP](https://jwebmp.com/)** — Server-driven web framework
- **[Angular](https://angular.dev/)** — Modern web framework

---

## Support

### For JWebMP-Specific Issues

- **GitHub Issues**: https://github.com/JWebMP/JWebMP/issues
- **Discussions**: https://github.com/JWebMP/JWebMP/discussions

### For Easing Questions

- **Easings.net**: https://easings.net/
- **Animation Resources**: https://angular.dev/guide/animations

---

**Made with JWebMP**
