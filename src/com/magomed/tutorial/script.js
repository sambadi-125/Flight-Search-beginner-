var submit = document.getElementById("submit");

function showInput() {
    var fromPlace = document.getElementById("from_place").value;
    var fromDate = document.getElementById("from_date").value;
    var toPlace = document.getElementById("to_place").value;
    var toDate = document.getElementById("to_date").value;
    var nrPassengers = document.getElementById("qty_passengers").value;

    document.getElementById("depPl").innerHTML = fromPlace;
    document.getElementById("departure_date").innerText = fromDate;
    document.getElementById("destination_place").innerText = toPlace;
    document.getElementById("destination_date").innerText = toDate;
    document.getElementById("passengers").innerText = nrPassengers;
}

function reset() {
    location.reload()
}