package com.example.el_karawan

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.el_karawan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var counter10 =0
        var counter12 =0
        var counter15 =0
        var counter20 =0
        var counter30 =0
        var counter20k =0
        var counter25k = 0
        var counter30k =0
        var cTotalWithout = 10

        binding.up10.setOnClickListener {
            counter10++
            binding.K10.text = counter10.toString()
            cTotalWithout+=10
            binding.totalWithout.text = cTotalWithout.toString()
        }

        binding.up12.setOnClickListener {
            counter12++
            binding.k12.text = counter12.toString()
            cTotalWithout+=12
            binding.totalWithout.text = cTotalWithout.toString()
        }

        binding.up15.setOnClickListener {
            counter15++
            binding.k15.text = counter15.toString()
            cTotalWithout+=15
            binding.totalWithout.text = cTotalWithout.toString()
        }

        binding.up20.setOnClickListener {
            counter20++
            binding.k20.text = counter20.toString()
            cTotalWithout+=20
            binding.totalWithout.text = cTotalWithout.toString()
        }

        binding.up30.setOnClickListener {
            counter30++
            binding.k30.text = counter30.toString()
            cTotalWithout+=30
            binding.totalWithout.text = cTotalWithout.toString()
        }

        binding.up20k.setOnClickListener {
            counter20k++
            binding.kk20.text = counter20k.toString()
            cTotalWithout+=20
            binding.totalWithout.text = cTotalWithout.toString()
        }

        binding.up25k.setOnClickListener {
            counter25k++
            binding.kk25.text = counter25k.toString()
            cTotalWithout+=25
            binding.totalWithout.text = cTotalWithout.toString()
        }

        binding.up30k.setOnClickListener {
            counter30k++
            binding.kk30.text = counter30k.toString()
            cTotalWithout+=30
            binding.totalWithout.text = cTotalWithout.toString()
        }

        binding.down10.setOnClickListener {
            if(counter10>0)
            {
                counter10--
                binding.K10.text = counter10.toString()
                cTotalWithout-=10
                binding.totalWithout.text = cTotalWithout.toString()
            }
            else {
                Toast.makeText(applicationContext, "خخخ هنهزر !", Toast.LENGTH_SHORT).show()
            }
        }

        binding.down12.setOnClickListener {
            if(counter12>0)
            {
                counter12--
                binding.k12.text = counter12.toString()
                cTotalWithout-=12
                binding.totalWithout.text = cTotalWithout.toString()
            }
            else {
                Toast.makeText(applicationContext, "خخخ هنهزر !", Toast.LENGTH_SHORT).show()
            }
        }

        binding.down15.setOnClickListener {
            if(counter15>0)
            {
                counter15--
                binding.k15.text = counter15.toString()
                cTotalWithout-=15
                binding.totalWithout.text = cTotalWithout.toString()
            }
            else {
                Toast.makeText(applicationContext, "خخخ هنهزر !", Toast.LENGTH_SHORT).show()
            }
        }

        binding.down20.setOnClickListener {
            if(counter20>0)
            {
                counter20--
                binding.k20.text = counter20.toString()
                cTotalWithout-=20
                binding.totalWithout.text = cTotalWithout.toString()
            }
            else {
                Toast.makeText(applicationContext, "خخخ هنهزر !", Toast.LENGTH_SHORT).show()
            }
        }

        binding.down30.setOnClickListener {
            if(counter30>0)
            {
                counter30--
                binding.k30.text = counter30.toString()
                cTotalWithout-=30
                binding.totalWithout.text = cTotalWithout.toString()
            }
            else {
                Toast.makeText(applicationContext, "خخخ هنهزر !", Toast.LENGTH_SHORT).show()
            }
        }

        binding.down20k.setOnClickListener {
            if(counter20k>0)
            {
                counter20k--
                binding.kk20.text = counter20k.toString()
                cTotalWithout-=20
                binding.totalWithout.text = cTotalWithout.toString()
            }
            else {
                Toast.makeText(applicationContext, "خخخ هنهزر !", Toast.LENGTH_SHORT).show()
            }
        }

        binding.down25k.setOnClickListener {
            if(counter25k>0)
            {
                counter25k--
                binding.kk25.text = counter25k.toString()
                cTotalWithout-=25
                binding.totalWithout.text = cTotalWithout.toString()
            }
            else {
                Toast.makeText(applicationContext, "خخخ هنهزر !", Toast.LENGTH_SHORT).show()
            }
        }

        binding.down30k.setOnClickListener {
            if(counter30k>0)
            {
                counter30k--
                binding.kk30.text = counter30k.toString()
                cTotalWithout-=30
                binding.totalWithout.text = cTotalWithout.toString()
            }
            else {
                Toast.makeText(applicationContext, "خخخ هنهزر !", Toast.LENGTH_SHORT).show()
            }
        }


        binding.done.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "01001180077")
            startActivity(dialIntent)
        }

        binding.menu.setOnClickListener {
            val intent = Intent(this, MenuKosh::class.java)
            startActivity(intent)
        }

    }
}