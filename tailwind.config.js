/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    "./src/main/resources/templates/**/*.html", // HTML templates
    "./src/main/resources/static/css/**/*.css"  // Include CSS files for Tailwind utility classes
    "./src/main/resources/static/js/**/*.js"
  ],
  theme: {
    extend: {},
  },
  plugins: [],
}
