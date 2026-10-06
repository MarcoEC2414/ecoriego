# EcoRiego — Mi Huerto Inteligente

Proyecto integrador de Desarrollo de Aplicaciones Móviles en Android.

## Tecnologías
- Android Studio
- Java
- XML + Android Views
- SQLite / SQLiteOpenHelper
- RecyclerView + Adapter + ViewHolder
- HttpURLConnection + JSON
- Open-Meteo
- Minimum SDK 26

## Funcionalidades
- Dashboard con clima actual y probabilidad de precipitación.
- CRUD completo de plantas.
- Detalle de planta y estado de riego.
- Bitácora 1:N de riegos.
- Reportes SQL con JOIN, GROUP BY, ORDER BY y LIMIT.
- Validaciones de formularios.
- Manejo de errores de red en hilo secundario.
- Navegación mediante Intents entre 4 Activities.
- Sin login ni carrito.

## Ubicación del clima
El ejemplo usa Lima (-12.05, -77.04). Puedes cambiar las coordenadas en `WeatherService.java`.

## Base de datos
Tablas `plantas` y `bitacora_riego`, relacionadas por `planta_id`.
