function calculateCrcl(age, weight, isMale, cr) {
    let genderConstant = 0.85;
    isMale ? genderConstant = 1 : genderConstant = 0.85;
    return (140 - age) * weight * (genderConstant / 72 * cr);
}

function calculateIbw(isMale, height) {
    let weightConstant;
    let height_inch;
    isMale ? weightConstant = 50 : weightConstant = 45.5;
    height_inch = height / 2.54;
    return weightConstant + 2.3 * (height_inch - 60);
}

function saveDrugInteractivity(isDrugDim, isDrugNeutral, isDrugEnhancing) {
    if (isDrugDim) {
        return -1;
    }
    else if (isDrugNeutral) {
        return 0;
    }
    else if (isDrugEnhancing) {
        return 1;
    }
}

async function runJavaProgram() {
    // Obtaining the inputs
    const age = document.getElementById('age').value;
    const height = document.getElementById('height').value;
    const weight = document.getElementById('weight').value;
    const isMale = document.getElementById('male').checked;
    const creatinine = document.getElementById('cr').value;
    const isDrugDim = document.getElementById("drug_diminishing").checked;
    const isDrugNeutral = document.getElementById("drug_neutral").checked;
    const isDrugEnhancing = document.getElementById("drug_enhancing").checked;

    // Model input calculations
    const crcl = calculateCrcl(age, weight, isMale, creatinine);
    const ibw = calculateIbw(isMale, height);
    const drugInteractivity = saveDrugInteractivity(isDrugDim, isDrugNeutral, isDrugEnhancing);

    console.log(crcl);
    console.log(ibw);
    console.log(drugInteractivity);

    const response = await fetch('/runJavaProgram', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ crcl, ibw, drugInteractivity })
    });

    const result = await response.json();

    document.getElementById('output').innerText = `Recommended Dose: ${result.output}.`;
}
