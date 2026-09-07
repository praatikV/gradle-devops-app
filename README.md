# Gradle DevOps Demo App

A simple Java application built and automated with **Gradle**, demonstrating
core DevOps practices: build automation, dependency management, and CI/CD.

## Project structure

```
gradle-devops-app/
├── app/
│   ├── build.gradle              # Module build config: plugins, deps, tasks
│   └── src/
│       ├── main/java/com/devops/app/
│       │   ├── App.java
│       │   └── Calculator.java
│       └── test/java/com/devops/app/
│           ├── AppTest.java
│           └── CalculatorTest.java
├── .github/workflows/ci.yml      # CI/CD pipeline (GitHub Actions)
├── build.gradle                  # Root build config
├── settings.gradle               # Module registration
├── gradle.properties             # Build performance flags
├── gradlew / gradlew.bat         # Gradle Wrapper (no local Gradle install needed)
└── gradle/wrapper/               # Wrapper jar + config
```

## 1. Build automation

```bash
./gradlew build       # compiles, tests, and packages the app
./gradlew clean build # clean rebuild
./gradlew buildPipeline # custom task: clean + build in one CI-style step
```

## 2. Dependency management

Declared in `app/build.gradle`:
- `guava` — general-purpose library (runtime dependency)
- `junit-jupiter` (JUnit 5) — test framework, pulled via the JUnit BOM for
  consistent version alignment

Gradle resolves these automatically from Maven Central — no manual jar handling.

## 3. Run the app

```bash
./gradlew run
```

## 4. Run tests + coverage

```bash
./gradlew test
```
JaCoCo generates an HTML coverage report at:
`app/build/reports/jacoco/test/html/index.html`

## 5. CI/CD pipeline

`.github/workflows/ci.yml` runs on every push/PR to `main`:
1. Checks out code
2. Sets up JDK 17
3. Caches Gradle dependencies (faster builds)
4. Runs `./gradlew build` and `./gradlew test`
5. Uploads test reports and the built JAR as workflow artifacts

This gives continuous delivery: every commit is automatically validated,
and a deployable JAR is produced as a build artifact.

## 6. DevOps principles demonstrated

| Principle | How it's shown here |
|---|---|
| Automation | Gradle handles compile/test/package with one command |
| Consistency | Gradle Wrapper pins the exact Gradle version for every dev/CI machine |
| Fast feedback | CI runs tests on every push, catching issues early |
| Reproducibility | Dependency versions are locked in `build.gradle` |
| Continuous Delivery | CI produces a versioned, deployable JAR artifact automatically |
