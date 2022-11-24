package comakki.logisticapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var transportFactory: TransportFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        createTransport()
    }

    private fun initViews() {
        val air = findViewById<Button>(R.id.air)
        val road = findViewById<Button>(R.id.road)
        val sea = findViewById<Button>(R.id.sea)
        val tvOp = findViewById<TextView>(R.id.tv_price)
        air.setOnClickListener {
            tvOp.text =
                transportFactory.getTransportType(TransportFactory.Route.AIR).deliverPackage()
        }

        road.setOnClickListener {
            tvOp.text =
                transportFactory.getTransportType(TransportFactory.Route.ROAD).deliverPackage()
        }

        sea.setOnClickListener {
            tvOp.text =
                transportFactory.getTransportType(TransportFactory.Route.SEA).deliverPackage()
        }
    }

    private fun createTransport() {
        transportFactory = TransportFactory()
    }
}