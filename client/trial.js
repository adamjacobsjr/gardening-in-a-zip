fetch('http://localhost:8080/Home')
.then(response => response.json())
.then(jsonData => {
    // console.log(jsonData);
    jsonData.map(plants=>{
        const plantName = document.createElement("h2");

        plantName.innerText = plants.name;
        console.log(plants.hardiness)
    })

})
