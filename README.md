# com.guru99

![Java](https://img.shields.io/badge/Java-8-blue) ![Selenium](https://img.shields.io/badge/Selenium-3.x-green) ![TestNG](https://img.shields.io/badge/TestNG-6.x-orange) ![Maven](https://img.shields.io/badge/Build-Maven-red)

A Selenium WebDriver practice project targeting the [Guru99 Bank](https://demo.guru99.com/V4/index.php) demo application. Built with Java, TestNG, and Maven to practice web automation fundamentals including login, account management, and fund transfers.

---

## 🛠 Tech Stack

| Tool | Details |
|---|---|
| Java | 8+ |
| Selenium WebDriver | 3.x |
| TestNG | 6.x |
| Maven | 3.x |
| Pattern | Page Object Model |

---

## 🌐 Test Application

Tests run against the [Guru99 Bank Demo](https://demo.guru99.com/V4/index.php) — a publicly available practice banking application.

> **Note:** A valid manager login ID and password is required. Register at [https://demo.guru99.com](https://demo.guru99.com) to get temporary credentials.

---

## 📁 Project Structure

```
src/
├── main/java/
│   ├── pages/          → Page Object classes
│   └── utils/          → Config reader and test data helpers
├── test/java/
│   └── tests/          → TestNG test classes
└── test/resources/
    └── config.properties
```

---

## ⚙️ Prerequisites

- Java JDK 8+
- Maven 3.x
- IDE: IntelliJ IDEA or Eclipse
- Chrome or Firefox browser

---

## ▶️ How to Run

```bash
# Clone the project
git clone https://github.com/mehedizamanhimel/com.guru99.git
cd com.guru99

# Run all tests
mvn clean test
```

### Via IDE

1. Open the project by navigating to `pom.xml` in IntelliJ IDEA or Eclipse
2. Select **Open as Project** if prompted
3. Run any test class as a **TestNG Test**, or run `testng.xml`

---

## ✅ Test Coverage

- Manager login and authentication
- New customer creation
- Edit customer details
- New account creation
- Fund deposit
- Fund withdrawal
- Fund transfer between accounts
- Account balance enquiry

---

## 📊 Reports

After execution, TestNG reports are available at:

```
test-output/index.html
test-output/emailable-report.html
```
