function removeRow(id) {
    // var sportId = link.getAttribute("span");
    $.ajax({
        type: "DELETE",
        url: "/api/employee/" + id,
        contentType: "application/json",
        dataType: 'json',
        success: function (result) {
            console.log(result);
        },
        error: function (e) {
            console.log(e);
        }
    })

}


// $(document).ready(function () {
//     $("#btnDelete").click(function() {
//         const idParam = getUrlParameter('id');
//     $.ajax({
//         type: 'delete',
//         url: `/api/employee/${idParam}`
//     });
//     })
// })

// $('#btnDelete').click(function () {
//     deleteEmployee();
//     return false;
// });