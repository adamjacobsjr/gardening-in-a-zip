let zipCodeTB = document.getElementById("zipCodeTB");
let submitButton = document.getElementById("submitButton");
let resultsContainer = document.getElementById("resultsContainer");
let chosenPlants = [];

async function fetchZone(zip) {
  let response = await fetch(`https://phzmapi.org/${zip}.json`);
  let zoneResults = await response.json();
  return zoneResults;
}

submitButton.addEventListener("click", async () => {
  let zipCode = zipCodeTB.value;

  const zipCodeRegex = /^\d{5}$/;

  if (zipCodeRegex.test(zipCode)) {
    let result = await fetchZone(zipCode);

    // let myZone = result.zone;
    // console.log(myZone);

    // let zone = `<div class="zoneDisplay">
    //     <h2> Your Growing Zone </h2>
    //     <span>Zone: ${result.zone}</span>
    //     <span>Temp Range: ${result.temperature_range}</span>
    //     <span>Lat: ${result.coordinates.lat}</span>
    //     <span>Lon: ${result.coordinates.lon}</span>
    //     </div>`

    // resultsContainer.innerHTML = zone
    // zipCodeTB.value = ''

    const tempZone = document.querySelector(".afterDesc");
    const plantSection = document.querySelector(".desc");
    const userTemp = document.createElement("h1");
    

    if(tempZone.hasChildNodes) {
      // console.log("Kids");

      // tempZone.removeChild(tempZone.lastChild)
      while(tempZone.firstChild){
        tempZone.removeChild(tempZone.firstChild);
      }

      while(plantSection.firstChild){
        plantSection.removeChild(plantSection.firstChild);
      }
    }

    userTemp.innerText = result.zone;

    
    
    while(tempZone.firstChild){
      tempZone.removeChild(tempZone.firstChild);
    }

    while(plantSection.firstChild){
      plantSection.removeChild(plantSection.firstChild);
    }
  
    
    
    fetch("http://localhost:8080/Home")
      .then((response) => response.json())
      .then((jsonData) => {

        

        jsonData.map((Plant) => {
          for (var key in Plant.hardiness) {
            if (Plant.hardiness[key].location == result.zone) {
              console.log("WORKING");

              // const fruitName = document.querySelector("p");
              // fruitName.innerText = Plant.name;

              // tempZone.appendChild(fruitName);

              const plantName = document.createElement("p");
              // const plantPic = document.createElement("img");

              plantName.classList.add("wow");
              
              plantName.innerHTML = `${Plant.name} <br>${Plant.description}`;

              plantName.style.backgroundImage = `url('${Plant.url}')`;
              const plantId = Plant.id;
              
              plantName.addEventListener("click",()=>{
                // console.log(Plant.name);
                
                if (!chosenPlants.includes(Plant.id)){
                  chosenPlants.push(Plant.id);
                  plantName.style.opacity = 1;
                }else{
                  plantName.style.opacity = .5;
                  const index = chosenPlants.indexOf(plantId);
                  chosenPlants.splice(index,1);

                }        
              
              })
              
              

              
              tempZone.appendChild(plantName);
            }
          }

          // console.log(hards);
        });
      });

    plantSection.appendChild(userTemp);
  } else {
    resultsContainer.innerHTML = "Please enter a valid zip code.";
    zipCodeTB.value = "";
  }
 

});



const myGarden = document.querySelector(".button1");
const modal = document.getElementById("myModal");
const modalContent = document.querySelector(".plantList");
const span = document.getElementsByClassName("close")[0];


// When the user clicks on <span> (x), close the modal
span.onclick = function() {
  modal.style.display = "none";
}

myGarden.addEventListener("click", ()=>{
  modal.style.display = "block";

  while(modalContent.firstChild){
    modalContent.removeChild(modalContent.firstChild);
  }

  chosenPlants.forEach(plant => {
    fetch(`http://localhost:8080/plant/${plant}`)
    .then(result => result.json())
    .then(modalPlant => {
      // console.log(modalPlant.name);
      const fruitName = document.createElement("h5");
      
      fruitName.innerText = modalPlant.name;

      modalContent.appendChild(fruitName);

     
    })
  })
})



  // When the user clicks anywhere outside of the modal, close it
  window.onclick = function(event) {
    if (event.target == modal) {
      modal.style.display = "none";
    }
  }
