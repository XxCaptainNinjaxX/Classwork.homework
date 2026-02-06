const button = document.getElementById("myButton");
const container = document.querySelector(".container");

var i = 0;

button.addEventListener("click", () => {
  i++;

  if (i == 1) {
    const para = document.createElement("p");
    para.innerHTML = "Yay you clicked me!";
    container.appendChild(para);
  }

  if (i == 2) {
    const hiddenMesg = document.createElement("small");
    hiddenMesg.innerHTML =
      "If your seeing this, id honestly love your opinion on my portfolio, no this nor my portfolio was ai'd, im just curious on your professional opinon and what else i can touch upon it";
    container.appendChild(hiddenMesg);

    container.appendChild(document.createElement("br"));

    const hiddenLink = document.createElement("a");

    hiddenLink.innerHTML = "Portfolio";
    hiddenLink.className = "hiddenBtn";
    hiddenLink.href = "https://robriguez.com/";
    hiddenLink.target = "_blank";
    hiddenLink.style.border = "1px solid black";
    hiddenLink.style.padding = "5px";

    container.appendChild(hiddenLink);
  }
});
