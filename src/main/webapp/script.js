function searchResource() {
    const keyword = document.getElementById("keyword").value;

    if (!keyword.trim()) {
        alert("请输入查询关键词！");
        return;
    }

    const xhr = new XMLHttpRequest();
    xhr.open("GET", `SearchServlet?keyword=${encodeURIComponent(keyword)}`, true);

    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4 && xhr.status === 200) {
            console.log(xhr.responseText)
            alert(xhr.responseText)
            document.getElementById("result").innerHTML = xhr.responseText;
        }
    };

    // 发送请求
    xhr.send();
}