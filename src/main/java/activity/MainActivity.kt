package activity

class MainActivity: AppCompatActivity {
  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)
    val textView = TextView(this)
    textView.text = "Hello world"
    setContentView(textView)
  }
}