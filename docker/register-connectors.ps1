$productConnector = @{
    name = "product-connector"
    config = @{
        "connector.class" = "io.debezium.connector.postgresql.PostgresConnector"
        "database.hostname" = "product-db"
        "database.port" = "5432"
        "database.user" = "postgres"
        "database.password" = "test12345"
        "database.dbname" = "products"
        "database.server.name" = "product_server"
        "plugin.name" = "pgoutput"
        "topic.prefix" = "product_cdc"
    }
} | ConvertTo-Json -Depth 5

$userConnector = @{
    name = "user-connector"
    config = @{
        "connector.class" = "io.debezium.connector.postgresql.PostgresConnector"
        "database.hostname" = "user-db"
        "database.port" = "5432"
        "database.user" = "postgres"
        "database.password" = "test12345"
        "database.dbname" = "users"
        "database.server.name" = "user_server"
        "plugin.name" = "pgoutput"
        "topic.prefix" = "user_cdc"
    }
} | ConvertTo-Json -Depth 5

Invoke-RestMethod -Uri "http://localhost:8083/connectors" -Method Post -Body $productConnector -ContentType "application/json"
Invoke-RestMethod -Uri "http://localhost:8083/connectors" -Method Post -Body $userConnector -ContentType "application/json"
Write-Host "Connectors registered successfully!"
