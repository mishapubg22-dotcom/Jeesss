# FunRTP

A fun random teleport plugin for Spigot/Bukkit Minecraft servers.

## Project Information

- **Version**: 1.2
- **API Version**: 1.16+
- **Main Class**: `ru.manus.funrtp.FunRTP`

## Features

- Random teleport functionality
- User-friendly RTP menu
- Admin commands for teleport management
- Cooldown management
- Economy integration via Vault
- Soft dependencies for FunEvents and SpookyEvents

## Building

### Prerequisites

- Java 11 or higher
- Maven 3.6+

### Build Instructions

```bash
# Clean and build
mvn clean package

# Run with skip tests
mvn clean package -DskipTests

# Install to local repository
mvn clean install
```

The compiled JAR will be located in the `target/` directory.

## Installation

1. Build the project using Maven
2. Copy the JAR file from `target/` to your Spigot server's `plugins/` directory
3. Restart your server
4. Configure via `plugins/FunRTP/config.yml`

## Plugin Permissions

- `funrtp.admin` - Access to admin RTP command (default: ops)

## Soft Dependencies

- Vault (for economy integration)
- FunEvents
- SpookyEvents

## Commands

- `/rtp` - Open the RTP menu
- `/funrtp` - Admin RTP command

## Project Structure

```
funrtp-project/
├── pom.xml                    # Maven configuration
├── src/
│   └── main/
│       ├── java/              # Source code
│       │   └── ru/manus/funrtp/
│       └── resources/         # Configuration files
│           ├── plugin.yml
│           └── config.yml
└── target/                    # Build output (generated)
```

## License

All rights reserved.

## Author

- Manus (ru.manus)
