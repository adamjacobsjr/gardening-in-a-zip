// async function fetchZone(zip) {
//     let response = await fetch(`https://phzmapi.org/${zip}.json`)
//     let zoneResults = await response.json()
//     return zoneResults
// }

const submitButton = document.querySelector("#submitButton");
const zipCode = document.querySelector("#zipCodeTB");
const header = document.createElement("h1");
const sub = document.createElement("h3");

submitButton.addEventListener("click",()=>{
    fetch(`https://phzmapi.org/${zip}.json`)
    .then(res => res.json())
    .then(tempZone => {
        // const newZip = zipCode.value;

        // let result = fetchZone(newZip);
    
        // header.innerText = `Your hardiness zone is:`;
    
        // // let zone = `<h3>${result}</h3>`;
        // // sub.innerText = result.zone;
        // console.log(fetchZone(newZip));
    
        // submitButton.appendChild(header);
        // submitButton.appendChild(sub);
    }


   
})  