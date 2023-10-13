let form = document.getElementById("form");
form.addEventListener("submit", (e) => {
    e.preventDefault();
    let firstName = document.getElementById("Firstname").value;
    let lastName = document.getElementById("Lastname").value;
    let dob = document.getElementById("DOB").value;
    let country = document.getElementById("Country").value;
    let gender = document.getElementById("Gender").value;
    let profession = document.getElementById("Profession").value;
    let email = document.getElementById("Email").value;
    let phoneNumber = document.getElementById("PhoneNumber").value;

    alert("First Name : " + firstName +
        "\nLast Name : " + lastName +
        "\nDate Of Birth : " + dob +
        "\nCountry : " + country +
        "\nGender : " + gender +
        "\nProfession : " + profession +
        "\nEmail : " + email +
        "\nPhone Number : " + phoneNumber)

    form.reset();
})

form.addEventListener("reset", form.reset())