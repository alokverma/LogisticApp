package comakki.logisticapp

class TransportFactory {
    enum class Route {
        SEA, ROAD, AIR
    }

    fun getTransportType(type: Route): Transport {
        return when (type) {
            Route.SEA -> {
                Ship()
            }
            Route.AIR -> {
                Air()
            }
            Route.ROAD -> {
                Truck()
            }
        }
    }
}

interface Transport {
    fun deliverPackage(): String
}

class Truck : Transport {
    override fun deliverPackage(): String {
        return "package is getting delivered via Truck"
    }
}

class Ship : Transport {
    override fun deliverPackage(): String {
        return "package is getting delivered via Ship"
    }
}

class Air : Transport {
    override fun deliverPackage(): String {
        return "package is getting delivered via Plane"
    }
}