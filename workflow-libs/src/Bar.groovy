class Bar {
  def steps

  Bar(steps) {
    this.steps = steps
  }

  def bar() {
    steps.echo "Bar.bar()"
  }
}
