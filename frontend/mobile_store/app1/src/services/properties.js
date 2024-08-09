// import axios from 'axios';
// import { config } from './config';

// // Function to get the list of mobiles
// export async function getProperties() {
//   try {
//     const token = sessionStorage['token'];
//     const response = await axios.get(`${config.serverUrl}/property`, {
//       headers: { token },
//     });
//     return response.data;
//   } catch (ex) {
//     console.log('exception: ', ex);
//   }

//   return null;
// }

// // Function to add a new mobile
// export async function addProperty(
//   brand,
//   model,
//   price,
//   processor,
//   ram,
//   storage,
//   battery,
//   camera,
//   is5G,
//   isWaterResistant,
//   isFingerprintSensor,
//   isFaceRecognition,
//   image
// ) {
//   // Use FormData to upload multi-part file
//   const body = new FormData();
//   body.append('brand', brand);
//   body.append('model', model);
//   body.append('price', price);
//   body.append('processor', processor);
//   body.append('ram', ram);
//   body.append('storage', storage);
//   body.append('battery', battery);
//   body.append('camera', camera);
//   body.append('is5G', is5G ? 1 : 0);
//   body.append('isWaterResistant', isWaterResistant ? 1 : 0);
//   body.append('isFingerprintSensor', isFingerprintSensor ? 1 : 0);
//   body.append('isFaceRecognition', isFaceRecognition ? 1 : 0);
//   body.append('image', image);

//   try {
//     const token = sessionStorage['token'];
//     const response = await axios.post(`${config.serverUrl}/property`, body, {
//       headers: { token },
//     });
//     return response.data;
//   } catch (ex) {
//     console.log('exception: ', ex);
//   }

//   return null;
// }
